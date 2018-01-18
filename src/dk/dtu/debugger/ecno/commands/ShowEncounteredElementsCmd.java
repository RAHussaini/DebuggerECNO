package dk.dtu.debugger.ecno.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import dk.dtu.debugger.ecno.views.GraphView;


public class ShowEncounteredElementsCmd extends AbstractHandler{

        @Override
        public Object execute(ExecutionEvent event) throws ExecutionException {
        		boolean show = !HandlerUtil.toggleCommandState(event.getCommand()); // returns old value, therefore negate
        		GraphView view = getView();
//            	System.out.println("show encountered: " + show);
            	if(view != null) view.showEncounteredElements(show);
        	
            return null;
        }
        
        private GraphView getView(){
        	IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
    				.findView(GraphView.ID);
            		if(view != null && view instanceof GraphView){
            			return (GraphView) view;
            		}
            		return null;
        }
        
        
}