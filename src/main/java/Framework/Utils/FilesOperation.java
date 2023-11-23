package Framework.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FilesOperation {
    private static final String DIR_PATH_PROPERTIES = System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "Properties" + File.separator;

    public Properties getProperties (String name) throws IOException {
        InputStream inputStream = null;
        Properties prop = new Properties();
        try{
            File file = new File(DIR_PATH_PROPERTIES+name+".properties");
            inputStream = new FileInputStream(file);
            prop.load(inputStream);
            return prop;

        } catch (Exception e) {
            System.out.println("Não carregou o arquivo de properties " + e.getMessage());
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        return prop;
    }
}