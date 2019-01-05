public class PhraseOMatic {

  public static void main(String[] args){

    String[] wordsOne = {
      "Powerful","Lightning-Fast","Progressive","Innovative",
      "Proprietary","Win-win","Web-based","Critical","Modern"
    };

    String[] wordsTwo = {
      "empowered","workhorse","digital","marketplace","groundbreaking",
      "cloud-hosted"
    };

    String[] wordsThree = {
      "solution","marketing","architecture","process","vision","mission",
      "strategy","paradigm"
    };

    String wordOne = randWord(wordsOne);
    String wordTwo = randWord(wordsTwo);
    String wordThree = randWord(wordsThree);

    String phrase = wordOne + " " + wordTwo + " " + wordThree;
    System.out.println(phrase);

  }

  public static String randWord(String[] wordList){
    return wordList[Math.toIntExact(Math.round(Math.random() * (wordList.length - 1)))];
  }

}