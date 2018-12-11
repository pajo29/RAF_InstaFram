package actions.clipboard;

import gui.tree.treeModel.Node;

import java.awt.datatransfer.*;
import java.io.IOException;
import java.util.ArrayList;

public class NodeSelection implements ClipboardOwner, Transferable
{
    private Node selectedNode;

    private DataFlavor dataFlavor;
    private DataFlavor[] dataFlavours = {dataFlavor};

    public NodeSelection(Node selectedNode)
    {
        this.selectedNode = selectedNode;

        try
        {
            dataFlavor = new DataFlavor(Class.forName("gui.tree.treeModel.Node"), "Children");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }


    @Override
    public void lostOwnership(Clipboard clipboard, Transferable transferable)
    {
        System.out.println("Izgubljen ownership");
    }

    @Override
    public DataFlavor[] getTransferDataFlavors()
    {
        return dataFlavours;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor)
    {
        return dataFlavor.equals(this.dataFlavor);
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException
    {
        if (dataFlavor.equals (this.dataFlavor))
            return (selectedNode);
        else
            throw new UnsupportedFlavorException (this.dataFlavor);
    }
}
