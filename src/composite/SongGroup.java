package composite;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {
	List<SongComponent> songComponents = new ArrayList<SongComponent>();
	
	String groupName;
	String groupDescription;
	
	public SongGroup(String nGrpNme, String nGrpDesc) {
		this.groupName = nGrpNme;
		this.groupDescription = nGrpDesc;
	}
	
	public String getGroupName() {
		return this.groupName;
	}
	
	public String getGroupDescription() {
		return this.groupDescription;
	}
	
	public void add(SongComponent songComponent) {
		songComponents.add(songComponent);
	}
	
	public void remove(SongComponent component) {
		songComponents.remove(component);
	}
	
	public SongComponent getComponent(int componentIndex) {
		return songComponents.get(componentIndex);
	}
	
	public void displaySongInfo() {
		System.out.println(getGroupName() + " " +getGroupDescription());
		
		for(SongComponent songComponent: songComponents) {
			songComponent.displaySongInfo();
		}
	}
}
