package All_prac.prac_18.task_4;

public class Calculator{
    public static <T, K extends Number> Number summ(T t, K k) {
        if (t instanceof Integer && k instanceof Integer) {
            return Integer.valueOf(((Integer) t).intValue() + ((Integer) k).intValue());
        } else if (t instanceof Double && k instanceof Integer) {
            return  Double.valueOf(((Double) t).doubleValue() + k.intValue());
        }
        else if(t instanceof Integer && k instanceof Double)
        {
            return  ((Integer) t).doubleValue()+k.doubleValue();
        }
        else if(t instanceof Double && k instanceof Double)
        {
           return ((Double) t).doubleValue()+k.doubleValue();
        }
        return null;
    }
    public static <T, K extends Number> Number multiply(T t, K k) {
        if (t instanceof Integer && k instanceof Integer) {
            return (int) Integer.valueOf(((Integer) t).intValue() * ((Integer) k).intValue());
        } else if (t instanceof Double && k instanceof Integer) {
            return (double) Double.valueOf(((Double) t).doubleValue() * k.intValue());
        }
        else if(t instanceof Integer && k instanceof Double)
        {
            return (double) ((Integer) t).doubleValue()*k.doubleValue();
        }
        else if(t instanceof Double && k instanceof Double)
        {
           return (double) ((Double) t).doubleValue()*k.doubleValue();
        }
        return null;
    }
    public static <T, K extends Number> Number divide(T t, K k) {
        if(k.doubleValue() == 0)
        {
            return null;
        }
        if (t instanceof Integer && k instanceof Integer) {
            return (int) Integer.valueOf(((Integer) t).intValue() / ((Integer) k).intValue());
        } else if (t instanceof Double && k instanceof Integer) {
            return (double) Double.valueOf(((Double) t).doubleValue() / k.intValue());
        }
        else if(t instanceof Integer && k instanceof Double)
        {
            return (float) ((Integer) t).doubleValue()/k.doubleValue();
        }
        else if(t instanceof Double && k instanceof Double)
        {
           return (double) ((Double) t).doubleValue()/k.doubleValue();
        }
        return null;
    }
    public static <T, K extends Number> Number subtraction(T t, K k) {
        if (t instanceof Integer && k instanceof Integer) {
            return (int) Integer.valueOf(((Integer) t).intValue() - ((Integer) k).intValue());
        } else if (t instanceof Double && k instanceof Integer) {
            return (double) Double.valueOf(((Double) t).doubleValue() - k.intValue());
        }
        else if(t instanceof Integer && k instanceof Double)
        {
            return (float) ((Integer) t).doubleValue() - k.doubleValue();
        }
        else if(t instanceof Double && k instanceof Double)
        {
           return (double) ((Double) t).doubleValue() - k.doubleValue();
        }
        return null;
    }
}
