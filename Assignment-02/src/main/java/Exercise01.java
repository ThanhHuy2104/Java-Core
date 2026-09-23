public class Exercise01 {
    void question05() {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Group group = new Group();
        group.accounts =  new Account[]{account1, account2, account3};
        switch(group.accounts.length) {
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Có nhiều thành viên");
        }
    }
}
