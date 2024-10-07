import java.util.ArrayList;
import java.util.List;

public class management {
    public static void main(String[] args) {
        lon lon1 = new lon();
        ga ga1 = new ga();
        vit vit1 = new vit();
        ca ca1 = new ca();

        List<dongvat> dv = new ArrayList<dongvat>();
        dv.add(vit1);
        dv.add(lon1);
        dv.add(ga1);
        dv.add(ca1);
        for(dongvat t : dv) {
            if(t.boi() && !t.dibo()) {
                System.out.println("con " + t.getName() + " nay boi");
            } else if(t.dibo() && !t.boi()) {
                System.out.println("con " + t.getName() + " nay di bo");
            } else {
                System.out.println("con " + t.getName() + " nay vua boi vua di bo");
            }
        }

    }
}
