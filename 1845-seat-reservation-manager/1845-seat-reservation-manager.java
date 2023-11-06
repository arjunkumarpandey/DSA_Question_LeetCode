class SeatManager {
    ArrayList<Integer> st = new ArrayList<>();
    private int n;
    private int top = 1;
    public SeatManager(int n) {
        this.n = n;
    }

    public int reserve() {
        if (!st.isEmpty()) {
            int rem = st.remove(0);
            return rem;
        } else if (top <= n) {
            return top++;
        } else {
            return -1;
        }
    }

    public void unreserve(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= n) {
            st.add(seatNumber);
            st.sort(null);
        }
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
