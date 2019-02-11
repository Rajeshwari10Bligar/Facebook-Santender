package utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utilities {

    private Properties prop;
        private final String propertyFilePath = "C:\\Users\\Hello\\IdeaProjects\\FacebookUrl\\src\\test\\java\\utility\\Config.properties";

        public Utilities () {
            InputStream reader = null;
            try {
                reader = new FileInputStream(propertyFilePath + "Config.properties") {
                //checked exception(Config.properties) we will get this exception
                    @Override
                    public int read() throws IOException {
                        return 0;
                    }
                };
                prop = new Properties();
                try {
                    prop.load(reader);
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("Config.properties not found at " + propertyFilePath);
            }
        }

        public String getDriverPath() {
            String driverPath = prop.getProperty(" ./src/test/java/");
            if (driverPath != null) return driverPath;
            else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
        }

        public long getImplicitlyWait() {
            String implicitlyWait = prop.getProperty("15");
            if (implicitlyWait != null) return Long.parseLong(implicitlyWait);
            else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
        }

        public String getApplicationUrl() {
            String url = prop.getProperty("http://facebook.com");
            if (url != null) return url;
            else throw new RuntimeException("url not specified in the Configuration.properties file.");
        }

    }

