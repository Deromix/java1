package ru.progwards.java1.lessons.classes1;

public class Count {
    public int count;
    public Count(){
        count = 0;
    }
    public Count(int count){
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public void inc(){
        count++;
    }
    public boolean dec(){
        count--;
        if (count <= 0 )
            return true;
        return false;
    }

    public static void main(String[] args){
        Count c1 = new Count(10);
        while(!c1.dec()) {
            if (c1.dec()) {
                System.out.println("count равен 0");
                break;
            }
        }
    }
}
