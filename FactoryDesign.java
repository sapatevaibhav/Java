interface OS {
    void specs();
}

class Android implements OS {
    public void specs() {
        System.out.println("Most Customizable");
    }
}

class iOS implements OS {
    public void specs() {
        System.out.println("Most Costly");
    }
}

class Mobian implements OS {
    public void specs() {
        System.out.println("Open Source");
    }
}

class CreateFactory {
    public OS getInstance(String str) {
        if (str.equals("Customizable"))
            return new Android();
        else if (str.equals("Costly"))
            return new iOS();
        else
            return new Mobian();
    }
}

class FactoryDesign {
    public static void main(String[] args) {
        CreateFactory obj = new CreateFactory();
        OS o = obj.getInstance("open");
        o.specs();
        System.out.println(o.getClass().getSimpleName());
    }
}