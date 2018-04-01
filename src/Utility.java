
public class Utility 
{
	
	public String DoEncryptionForString(String text)
	{
		 String EncryptedText="";   
		 for(int i=0;i<text.length();i++)
	     {
	 	   String temp=getEncryptedForChar(text.charAt(i));
		   EncryptedText=EncryptedText+temp;
		 }
     	  return EncryptedText; 
	}
	
	public String DoDecryptionForString(String text)
	{
		 String DecryptedText="";   
		 for(int i=0;i<text.length();i++)
	     {
	 	   String temp=getDecryptedForChar(text.charAt(i));
		   DecryptedText=DecryptedText+temp;
		 }
     	  return DecryptedText; 
	}
	
	public int getPlaceNoOfAlphabet(char ch,boolean isUpper)
	{
		int tempindex=-1;
		char temp=ch;
		if(isUpper)
		{
			String s=""+temp;
			s=s.toLowerCase();
			temp=s.charAt(0);
		}
		String alphPos[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
				"t","u","v","w","x","y","z","a","b","c","d"};
		for(int i=0;i<alphPos.length;i++)
		{
			if(alphPos[i].equals(""+temp))
			{
                tempindex=i;
                //break;
			}
		}
		
	    if(tempindex!=-1)
	    {
	    	return tempindex;
	    }
	    else
	    {
	    	return tempindex;
	    }
	}
	
	public String getAlphabetAtPlaceNo(int pos,boolean isUpper)
	{
		String tempString=null;
		int temp=pos;
		String alphPos[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
				"t","u","v","w","x","y","z"};
		for(int i=0;i<alphPos.length;i++)
		{
			if(i==temp)
			{
                tempString=alphPos[i];
                //break;
			}
		}
		
	    if(tempString!=null)
	    {
	    	if(isUpper)
	    	{
	    		return tempString.toUpperCase();
	    	}
	    	else
	    	{
	    		return tempString;
	    	}
	    }
	    else
	    {
	    	return tempString;
	    }
	}
	
	public String getEncryptedForChar(char charEncryp)
	{
		int k=4,p=-1;
		char temp=charEncryp;
		boolean ischarEncrypUpper=false;
		if(Character.isUpperCase(temp))
		{
			ischarEncrypUpper=true; 	
		}
		if(temp==' ')
		{
			return " ";
		}
		else
		{
		  String EncryptedChar=null;
		  int EncryptedCharPos;
		  p=getPlaceNoOfAlphabet(temp,ischarEncrypUpper);		
		  if(p!=-1)
		  {
			EncryptedCharPos=Math.abs((p+k)%26);
			EncryptedChar=getAlphabetAtPlaceNo(EncryptedCharPos,ischarEncrypUpper);	
			return EncryptedChar;			
		  }
		  else
		  {
		 	return EncryptedChar;
		  }
		}
	}
	
	public String getDecryptedForChar(char  charDecryp)
	{
		int k=4,p=-1;
		char temp=charDecryp;
		boolean ischarDecrypUpper=false;
		if(Character.isUpperCase(temp))
		{
			ischarDecrypUpper=true; 	
		}
		if(temp==' ')
		{
			return " "; 
		}
		else
		{
		   String DecryptedChar=null;
		   int DecryptedCharPos;
		   p=getPlaceNoOfAlphabet(temp,ischarDecrypUpper);		
		   if(p!=-1)
	       {
			  DecryptedCharPos=Math.abs((p-k)%26);
			  DecryptedChar=getAlphabetAtPlaceNo(DecryptedCharPos,ischarDecrypUpper);
		  	  return DecryptedChar;
	       }	
		   else
		   {
			 return DecryptedChar;
		   }
		}
	}

}
