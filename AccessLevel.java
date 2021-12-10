public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String access = "";
        String allowed = "A";
        String denied = "D";
        int length = rights.length;
        for (int i = 0; i < length; i++) {
            if(rights[i] >= minPermission) {
                access += allowed;
            }
            else {
                access += denied;
            }
        }
        return access;
    }
}
