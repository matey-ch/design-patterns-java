import java.util.List;

public class StringBuilder {

    private String string = "";

    public StringBuilder clear(){
        this.string="";
        return this;
    }

    public StringBuilder append(Object object){
        this.string += object;
        return this;
    }

    public StringBuilder append(List<Character> chars){
        for (char c:chars){
            this.string += c;
        }
        return this;
    }

    public StringBuilder insert(Object object, int position){
        this.string = this.string.substring(0,position) + object + this.string.substring(position);
        return this;
    }

    public StringBuilder insert(List<Character> chars, int position){
        String newString = this.string.substring(0,position);
        for (char c:chars){
            newString += c;
        }
        newString += this.string.substring(position);
        this.string = newString;
        return this;
    }

    @Override
    public String toString(){
        return this.string;
    }
}
