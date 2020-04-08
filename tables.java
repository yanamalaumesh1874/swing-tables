import javax.swing.*;    
public class tableex {    
    JFrame f;    
    tableex(){    
    f=new JFrame();    
    String data[][]={ {"1111","ARJUN REDDY","970000"},    
                          {"1112","AMITH","700000"},    
                          {"1113","VIJAY","700000"}};    
    String column[]={"ID","NAME","SALARY"};
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new tableex();    
}    
}  
