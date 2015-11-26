package king.notepad.listselectionlistener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import king.notepad.service.TextService;
import king.notepad.view.FontDialog;

//�����塱�б���
public class FontListSelectionListener implements ListSelectionListener {
    private FontDialog dialog;
    
    public FontListSelectionListener(FontDialog dialog){
        this.dialog = dialog;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        //�Ϸ��ı�����ʾ��ѡ�е��ı�
        TextService.setFontListSelected(dialog);
    }

}