import java.util.*;
import java.text.*;
import java.math.RoundingMode;

public class round
{
public static void main(String[] args)
{
Double D = 3.1795678;
Double d = Double.parseDouble(String.format("%.2f",D));
DecimalFormat dFormat = new DecimalFormat("0.###");
dFormat.setRoundingMode(RoundingMode.DOWN);
Double dd = Double.parseDouble(dFormat.format(D));
//System.out.println(d);
System.out.println(dd);
}
}
