package HW9_1.Main;

import HW9_1.Exceptions.AbcException;
import HW9_1.Exceptions.EndWith1a2bException;
import HW9_1.Exceptions.StartWith555Exception;
import HW9_1.FinancialInvoice.FinancialInvoice;
import HW9_1.Goods.Goods;
import HW9_1.Register.Register;
import HW9_1.Stuff.Stuff;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws  StartWith555Exception, EndWith1a2bException {
        //Почему не просит передать EndWith1a2bException?
        Register goods1 = new Register();
        try {
            goods1.saveTheDocument(new Goods("abc324",
                    "sasd", 1));
            goods1.checkException();
        } catch (AbcException e) {
            System.out.println(e.getMessage());
        }  catch (StartWith555Exception e){
           throw new StartWith555Exception("'555' Error!");
        } catch (EndWith1a2bException e){
            throw new EndWith1a2bException("'1a2b' Error!");
        }

    }
}