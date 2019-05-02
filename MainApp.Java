public class MainApp() {

    public static void main(String[] args) {
        
        EventQueue.InvokeLater(new Runnable(){
            @override
            public void run() {
                new MainWindow()
            }
        });
    }
}
