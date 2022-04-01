public class Team {
    class Member {
        private String name;
        private String position;
    }
    ArrayList<Member> members = new ArrayList<>();
    Scanner bill = new Scanner;
    // newMember (új csapattag hozzáadása), egy leaveTeam (adott csapattag törlése) és egy getMembers
    public void newMember(){
        Member newmember = new Member();
        System.out.printf("Kérem az új tag nevét: ");
        newmember.name = this.bill.next;
        System.out.printf("Kérem az új tag pozicióját: ");
        newmember.position = this.bill.next;
        members.add(newmember);
    }
    public void leaveTeam(){
        Member leavemember = new Member();
        System.out.printf("Kérem a kilépő tag nevét: ");
        leavemember.name = this.bill.next;
        System.out.printf("Kérem az kilépő tag pozicióját: ");
        leavemember.position = this.bill.next;
    }
    public ArrayList<Member> getMembers() {
        return members;
    }
}
