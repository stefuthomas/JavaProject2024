package Tehtavat4;
import java.io.*;
import java.net.*;

public class CSVReader {
    private final static String FILENAME = "temploki.csv";

    public static void main(String[] args) {
        BufferedReader bufferedstream = null;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;
        URL myURL;
        try {
            myURL = new URL("https://users.metropolia.fi/~jarkkov/" + FILENAME);
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myURL.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            bufferedstream = new BufferedReader(istreamreader);
            double sumTemp = 0;
            int count = 0;
            String targetDate = "01.01.2023";

            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    if (header) {
                        columnNames = line.split(";");
                        header = false;
                    } else {
                        String[] values = line.split(";");
                        if (values.length > 0 && values[0].contains(targetDate)) {
                            for (int i = 0; i < values.length; i++) {
                                if (columnNames[i].equals("UlkoTalo")) {
                                    try {
                                        if (!values[i].equals("*")) {
                                            double temp = Double.parseDouble(values[i].replace(",", "."));
                                            sumTemp += temp;
                                            count++;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.err.println(e);
                                    }
                                }
                            }
                        }
                    }
                }
            } while (line != null);

            if (count > 0) {
                double average = sumTemp / count;
                System.out.printf("Average temperature on %s: %.1f Celsius", targetDate, average);
            } else {
                System.out.println("No valid temperature data found for " + targetDate);
            }

        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (bufferedstream != null) {
                    bufferedstream.close();
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
