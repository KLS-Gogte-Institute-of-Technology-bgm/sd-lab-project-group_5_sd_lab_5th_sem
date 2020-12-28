package CODE;

import java.util.logging.Level;
import java.util.logging.Logger;

public class closeWindows implements Runnable {
    int temp = 1;
    welcome w;
    login lgn;
    dashboard d;
    AddNewMember anm;
    AddNewBook anb;
    AboutUs au;
    ViewMembers vm;
    ViewBooks vb;
    bookIssuedConfirmation bic;
    IssueBook ib;
    bookReturnConfirmation brc;
    ReturnBook rb;
    bookIssuedList bil;
    BookIssued bi;
    
    closeWindows(welcome w){
        this.w = w;
        temp = 1;
    }
    closeWindows(login lgn){
        this.lgn = lgn;
        temp = 2;
    }
    closeWindows(dashboard d){
        this.d = d;
        temp = 3;
    }
    closeWindows(AddNewMember anm){
        this.anm = anm;
        temp = 4;
    }
    closeWindows(AddNewBook anb){
        this.anb = anb;
        temp = 5;
    }
    closeWindows(AboutUs au){
        this.au = au;
        temp = 6;
    }
    closeWindows(ViewMembers vm){
        this.vm = vm;
        temp = 7;
    }
    closeWindows(ViewBooks vb){
        this.vb = vb;
        temp = 8;
    }
    closeWindows(bookIssuedConfirmation bic){
        this.bic = bic;
        temp = 9;
    }
    closeWindows(IssueBook ib){
        this.ib = ib;
        temp = 10;
    }
    closeWindows(bookReturnConfirmation brc){
        this.brc = brc;
        temp = 11;
    }
    closeWindows(ReturnBook rb){
        this.rb = rb;
        temp = 12;
    }
    closeWindows(bookIssuedList bil){
        this.bil = bil;
        temp = 13;
    }
    closeWindows(BookIssued bi){
        this.bi = bi;
        temp = 14;
    }
   
    //bookIssuedConfirmation bic
    
    @Override
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            
        }
        switch(temp){
            case 1 : w.setVisible(false);
                     break;
            case 2 : lgn.setVisible(false);
                     break;
            case 3 : d.setVisible(false);
                     break;
            case 4 : anm.setVisible(false);
                     break;
            case 5 : anb.setVisible(false);
                     break;
            case 6 : au.setVisible(false);
                     break;
            case 7 : vm.setVisible(false);
                     break;
            case 8 : vb.setVisible(false);
                     break;
            case 9 : bic.setVisible(false);
                     break;
            case 10 : ib.setVisible(false);
                     break;
            case 11 : brc.setVisible(false);
                     break;
            case 12 : rb.setVisible(false);
                     break;
            case 13 : bil.setVisible(false);
                     break;
            case 14 : bi.setVisible(false);
                     break;
        }
    }
}
