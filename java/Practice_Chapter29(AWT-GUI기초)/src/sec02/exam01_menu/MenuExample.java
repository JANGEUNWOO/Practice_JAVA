package sec02.exam01_menu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuExample {

   public static void main(String[] args) {
      
      Frame f = new Frame("�޴� ����");
      f.setSize(300, 200);
      
      //MenuBar�� �����.
      MenuBar mb = new MenuBar();
      //Menu�� �����.
      Menu mFile = new Menu("����");
      
      //MenuItem�����
      MenuItem miNew = new MenuItem("�� ����");
      MenuItem miOpen = new MenuItem("����");
      
      //MenuItem�� �ƴ϶� Menu�ӿ� ����
      Menu mOthers = new Menu("��Ÿ");
      
      //MenuItem�����
      MenuItem miExit = new MenuItem("������");
      
      mFile.add(miNew);      //Menu�� MenuItem���� �߰��Ѵ�.
      mFile.add(miOpen);      
      
      //Menu�� Menu�� �߰��ϰ� �ִ� �Ϳ� �ָ��� ����.
      //(������ �޴��� ����� �ִ�)
      mFile.add(mOthers);
      
      //�޴� �и����� �ִ´�.
      mFile.addSeparator();
      mFile.add(miExit);
      
      //��Ÿ�޴��� �� MenuItem�����
      MenuItem miPrint = new MenuItem("���");
      MenuItem miPreview = new MenuItem("�̸� ����");
      MenuItem miSetup = new MenuItem("������ ����");
      
      //��Ÿ �޴��� �߰�
      mOthers.add(miPrint);
      mOthers.add(miPreview);
      mOthers.add(miSetup);
      
      Menu mEdit = new Menu("����");
      Menu mView = new Menu("����");
      Menu mHelp = new Menu("����");
      
      //CheckboxMenuItem(String name, boolean status)
      //name = CheckboxMenuItem�� ������ menu�̸�.
      //status - ���� true��, üũ�� ���·� ����(Checkboxó�� �޴��� Ŭ����
      //������ �޴� �տ� üũǥ�ð� �����ǰų� �����ȴ�.)
      CheckboxMenuItem miStatusbar = new CheckboxMenuItem("����ǥ��");
      mView.add(miStatusbar);
      
      //MenuBar�� Menu�� �߰��Ѵ�.
      mb.add(mFile);
      mb.add(mEdit);
      mb.add(mView);
      //mb.sethelpMenu(mHelp);   //mHelp�� HelpMenu�� �����Ѵ�.
      mb.add(mHelp);
      
      f.setMenuBar(mb);      //Frame�� MenuBar�� ���Խ�Ų��.
      f.setVisible(true);
   }
}
