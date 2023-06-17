//Name :  Viren Srinivas
// DXC Assignment - Encoder (New) V1


/*
This assignment was done using Hashmap to store the reference table which holds characters as key and index as value. Additionally,
a reference Character Array is used to store the characters. So, when we wish to shift the reference table down by an offset character, the index of the
offset character ( i.e. shift index) can be obtained from the hashmap. Then we can obtain the index of the characters after shifting by using the shift index (shown
below for in encode() and decode() function). Once the index of the characters after shifting is obtained, we can get the character associated with the index from
the referenceChar character array.
 */

package Test;

import java.util.HashMap;
import java.util.Map;

public class EncoderV1 {
    private Map<Character, Integer> referenceTable;
    private final static char referenceChar[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '(', ')', '*', '+', ',', '-', '.', '/'};

    public EncoderV1()
    {
        //Creating HashMap to store reference table which holds characters as key and index as value
        referenceTable = new HashMap<>();
        for(int i = 0; i<referenceChar.length;i++)
        {
            referenceTable.put(referenceChar[i],i);
        }
    }

    public String encode(String plainText) {

        char offset = 'F'; //Denotes the offset character. Any of the 44 characters in the reference table can be used.

        String encodedText = "";

        if(!(referenceTable.containsKey(offset)))
        {
            encodedText =  offset + plainText;
            return encodedText;
        }

        plainText = plainText.toUpperCase(); // convert text to upper case

        int n = referenceTable.size(); // size of reference table (44)
        int shiftIndex = referenceTable.get(offset); // retrieves the shift index from the reference table

        encodedText = encodedText + referenceChar[shiftIndex]; //Adding offset character as first character of encoded text as per question requirements.

        int newIndex; // variable used to store new index of character after shifting

        for (int i = 0; i < plainText.length(); i++) {

            if (referenceTable.containsKey(plainText.charAt(i))) {

                    newIndex = (referenceTable.get(plainText.charAt(i)) - shiftIndex) % n; //retrieving new index of characters after shifting down for encryption
                    if (newIndex < 0) {
                        newIndex = newIndex + n;
                    }
                    encodedText = encodedText + referenceChar[newIndex];

            } else {
                encodedText = encodedText + plainText.charAt(i);
            }

        }


    return encodedText;
    }

    public String decode(String encodedText) {

        char offset = encodedText.charAt(0); //getting offset character from encodedText as per question specification

        encodedText = encodedText.toUpperCase(); //convert to uppercase

        int n = referenceTable.size(); // size of reference table (44)
        int shiftIndex = referenceTable.get(offset); // retrieves the shift index from the reference table

        String plainText = "";
        int newIndex; // variable used to store new index of character after shifting

        //Loop starting from 1 since first character in encodedText is offset character
        for (int i = 1; i < encodedText.length(); i++)
        {
            if(referenceTable.containsKey(encodedText.charAt(i)))
            {
                if (!((encodedText.charAt(i)) == ' '))
                {

                    newIndex = (referenceTable.get(encodedText.charAt(i)) + shiftIndex) % n; //retrieving new index of characters after shifting up for decryption
                    plainText = plainText + referenceChar[newIndex];

                } else
                {
                    plainText = plainText + ' ';
                }
            }
            else
            {
                plainText = plainText + encodedText.charAt(i);

            }
        }

        return plainText;
    }



    public static void main(String[] args)
    {
        String plainText = "HELLO WORLD&";
        String encodedText = "BGDKKN VNQKC&";

        EncoderV1 E = new EncoderV1();

        System.out.println("Encoding:");
        System.out.println("Plain Text: " + plainText);
        System.out.println("Encoded Text: " + E.encode(plainText));

        System.out.println();

        System.out.println("Decoding:");
        System.out.println("Encoded Text: " + encodedText);
        System.out.println("Plain Text: " + E.decode(encodedText));
    }
}

