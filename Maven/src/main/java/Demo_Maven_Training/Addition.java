package Demo_Maven_Training;

import AdditionService.AdditionService;
public class Addition {
    AdditionService service;
    public Addition(){}
    public Addition(AdditionService service) {
        this.service = service;
    }

    public int addition(int a, int b){
        System.out.println("In Demo_Maven_Training.Addition");
        return service.addition(a,b);
    }

    public int add(int c, int d){
        return c+d;
    }

}
