public class PositionChange extends Team{
    public void promote(){
        Member promotemember = new Member();
        System.out.printf("Kérem a promótáladó tag nevét: ");
        promotemember.name = super.bill.next;
        System.out.printf("Kérem a promótáladó tag pozícióját: ");
        promotemember.position = super.bill.next;
        if (super.members.contains(promotemember)){
            System.out.printf("Kérem a promótáladó tag új pozícióját: ");
            super.members.change(promotemember.name, super.bill.next);
        }
        else System.out.print("Nincs ilyen tag.");
    }
}
