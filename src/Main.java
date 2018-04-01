public class Main
{
  public static  void main(String args[])
  {
      Utility u=new Utility();
      String EncryptedString=u.DoEncryptionForString("Text to Encrpypt");
      System.out.println(EncryptedString);

      String DecryptedString=u.DoDecryptionForString(EncryptedString);
      System.out.println(DecryptedString);

  }
}
