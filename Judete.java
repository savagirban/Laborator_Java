import java.io.*;
import java.util.Arrays;
public class Judete {
    private String[] _judete = new String[42];



    public void loadFromFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = " ";
        int i=0;
        while(line!=null)
        {
            try {
                line = reader.readLine();
                _judete[i++] = line;

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Arrays.sort(_judete);
    }
    public int indexOf(String judet)
    {
      //  return Arrays.binarySearch(_judete,judet);
    }
}
