package gui.tree;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import gui.tree.treeModel.Module;
import gui.tree.treeModel.Parametar;
import gui.tree.treeModel.Product;
import gui.tree.treeModel.SoftwareCompany;



@SuppressWarnings("serial")
public class TreeCellRenderer extends DefaultTreeCellRenderer
{
	
	public TreeCellRenderer()
	{
		
	}
	
	public Component getTreeCellRendererComponent(
            JTree tree,
            Object value,
            boolean sel,
            boolean expanded,
            boolean leaf,
            int row,
            boolean hasFocus) {
                super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row,hasFocus);
                
          
            if(value instanceof SoftwareCompany)
            {
            	setIcon(new ImageIcon("src/actions/images/softwareCompany.png"));
            }
            if(value instanceof Product)
            {
            	setIcon(new ImageIcon("src/actions/images/product.png"));
            }
            if(value instanceof Module)
            {
            	setIcon(new ImageIcon("src/actions/images/module.png"));
            }
            if(value instanceof Parametar)
            {
            	setIcon(new ImageIcon("src/actions/images/mainComponent.png"));
            }
        	  
          return this;
}

}
