# Java_daily
public class cipherkey 
{
    
    public String normal;
    public String encrypted;
    public void SetNormal(String str)
    {
        normal=str;
    }
    public void SetEncrypted(String str)
    {
        encrypted = str;
    }
    private String decryption()
    {
        String str="";
        int counter = this.encrypted.length();
        int[]array = new int[counter];
            for (int i = 0;i < counter;i++)
            {
                char single = this.encrypted.charAt(i);
                int n = (int) single;
                if (n !=32)
                {
                   n = n-1; 
                }
                if (n == 64) {
                    n = 90;
                }
                if (n == 96) {
                    n = 122;
                }
                array[i] = n;
            }
            for (int i=0;i < array.length;i++)
            {
                str += Character.toString((char)(int)array[i]);
            }
            return str;
    }
    private String encryption()
    {
    String str = "";
        int counter = this.normal.length();
        int[]array = new int[counter];
            for (int i = 0;i < counter;i++)
            {
char single = this.normal.charAt(i);
                int k = (int) single;
                if (k !=32)
                {
                   k = k+1; 
                }
                if (k == 91) {
                    k = 65;
                }
                if (k == 123) {
                    k = 97;
                }             
                array[i]= k;
            }
            for (int i=0;i < array.length;i++)
            {
                str += Character.toString((char)(int)array[i]);
            }
            return str;
    }
    public String GetDycrypted()
    {
        String k = decryption();
        return k;
    }
    public String GetEncrypted()
    {
        String m = encryption();
        return m;
    }
    
}
