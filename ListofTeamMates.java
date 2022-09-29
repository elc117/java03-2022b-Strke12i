import java.util.ArrayList;

public class ListofTeamMates {
	public static void main(String[] args) {
		ArrayList<TeamMates> colegas = new ArrayList<TeamMates>();
		TeamMates m1 = new TeamMates();
		TeamMates m2 = new TeamMates("Id1234","Teste1",true);
		TeamMates m3 = new TeamMates("Id1235","Teste2");
		TeamMates m4 = new TeamMates("Id1236","Teste3",true);
		
		colegas.add(m1);
		colegas.add(m2);
		colegas.add(m3);
		colegas.add(m4);
		
		System.out.println("Nomes:");
		for(TeamMates m:colegas) {
			System.out.println(m.getName());
		}
		
		System.out.println("\n\nIds online");
		for(TeamMates m:colegas) {
			if(m.isOnline()) {
				System.out.println(m.getUserId());
			}
		}
		
		if(!colegas.isEmpty())
			colegas.remove(colegas.size() - 1);
		
		System.out.println("Remove Ultimo:");
		for(TeamMates m:colegas) {
			System.out.println(m.getName());
		}
	}
}
