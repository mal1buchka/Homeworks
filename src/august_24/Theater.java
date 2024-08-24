package august_24;

import java.util.HashMap;
import java.util.Map;

public class Theater <K,V extends Person>{
    private HashMap<K,V[]> theater; // K-номер ряда V-массив Client Staff Critic
    private int seatPerRow;
    public Theater(int seats) {
        this.theater = new HashMap<>();
        this.seatPerRow = seats;
    }
    public void addPerson(K rowNum, V person) {
        try {
            V[] row = theater.computeIfAbsent(rowNum, k -> (V[]) new Person[seatPerRow]);
            for (int i = 0; i < seatPerRow; i++) {
                if (row[i] == null) {
                    row[i] = person;
                    return;
                }
            }
            throw new InvalidException("Ряды полные");
        }catch (InvalidException e){
            e.printStackTrace();
        }
    }
    public void removePerson(K rowNum, int seatNum) {
        try{
        V[] row = theater.get(rowNum);
        if(row != null && seatNum >=0 && seatNum < seatPerRow) {
            row[seatNum] = null;
        }else{
            throw new InvalidException("Invalid seat number");
        }
        }catch (InvalidException e){
          e.printStackTrace();
        }
    }
    public void checkTickets(){
        for (Map.Entry<K, V[]> entry : theater.entrySet()) {
            K rowNumber = entry.getKey();
            V[] row = entry.getValue();

            for (int i = 0; i < row.length; i++) {
                V person = row[i];
                if (person != null) {
                    System.out.println("Ряд: " + rowNumber + ", Место: " + (i+1) + ", Объект Person: " + person);
                    //если место c 0, то (i+1) надо изменить на i
                }
            }
        }
    }

}
