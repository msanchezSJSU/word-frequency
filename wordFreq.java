public class wordFreq {
    String word;
    int frequency;

    public wordFreq(String word, int frequency){
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord(){
        return this.word;
    }

    public int getFreq(){
        return this.frequency;
    }

    public wordFreq compare(wordFreq wf1, wordFreq wf2){
        if (wf1.getFreq() > wf2.getFreq()){
            return wf1;
        } else {
            return wf2;
        }
    }

    public static void main(String[] args) {
        wordFreq[] wf = {
            new wordFreq("happy",400),
            new wordFreq("satisfied", 100),
            new wordFreq("neutral", 300),
            new wordFreq("would buy again", 200),
            new wordFreq("terrible",160),
            new wordFreq("inconvenient", 900),
            new wordFreq("difficult to use", 100),
            new wordFreq("easy to use", 140),
            new wordFreq("would recommend to friends", 800),
            new wordFreq("visit the store", 700),
        };
    }
}
