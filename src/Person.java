public class Person {
    protected String name;
    protected String lastName;
    protected int qTickets;

    public Person(String name, String lastName, int q){
        this.name = name;
        this.lastName = lastName;
        this.qTickets = q;
    }

    public boolean useTicket(){
        if (qTickets != 0) {
            qTickets--;
            return true;
        } else return false;
    }
    public String toString(Person person){
        return (person.name + " " + person.lastName + " Осталось покататься " + person.qTickets + " раз");
    }
}
