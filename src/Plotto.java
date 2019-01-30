import java.util.ArrayList;
import java.util.List;

public class Plotto {

	List<Conflict> conflicts;

	public Plotto() {
		super();
		conflicts = new ArrayList<Conflict>();
		Conflict c = new Conflict();
		c.setNumber(900);
		c.setLeadups(1330);
		c.setLeadups(1350);
		c.setCarryons(150);
		c.setCarryons(634);
		c.setText(
				"*A*’s imagination leads his mind astray, and in seeking emancipation from fancied misfortunes he is plunged into real misfortunes.");
		conflicts.add(c);
	}

	private void generate() {
		// TODO Auto-generated method stub
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(Conflict c : conflicts) {
			sb.append( c.getText());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plotto p = new Plotto();
		p.generate();
		System.out.println(p);
//		int choice;
//		choice = (int) (Math.random() * Aclauses.length);
//		System.out.println(Aclauses[choice]);
//		choice = (int) (Math.random() * Bclauses.length);
//		System.out.println(Bclauses[choice]);
//		choice = (int) (Math.random() * Cclauses.length);
//		System.out.println(Cclauses[choice]);
	}

	static String Aclauses[] = new String[] { "A Person in Love", "A Married Person", "A Lawless Person",
			"An Erring Person", "A Benevolent Person", "A Protecting Person", "A Person of Ideals",
			"A Person Influenced by an Obligation", "A Person Subjected to Adverse Conditions", "A Resentful Person",
			"A Person Swayed by Pretense", "A Subtle Person", "A Person Influenced by the Occult and the Mysterious",
			"A Normal Person", "Any Person" };
	static String Bclauses[] = new String[] {
			"(1) Engaging in a difficult enterprise when promised a reward for high achievement,",
			"(2) Falling in love at a time when certain obligations forbid love,",
			"(3) Seeking to demonstrate the power of love by a test of courage.",
			"(4) Being impelled by inordinate fancy to exercise mistaken judgment in a love affair",
			"(5) Becoming involved in a hopeless love affair, and seeking to make the best of a disheartening situation,",
			"(6) Challenging, in a quest of love, the relentless truth that �East is East, and West is West, and never the twain shall meet,�",
			"(7) Becoming involved in a love affair that encounters unforeseen obstacles,",
			"(8) Confronting a situation in which wealth is made conditional upon a certain course of action in a love affair,",
			"(9) Being put to a test in which love will be lost if more material fortunes are advanced,",
			"(10) Suffering an estrangement due to mistaken judgment,",
			"(11) Confronting a situation in which courage and devotion alone can save the fortunes of one beloved,",
			"(12) Falling into misfortune through disloyalty in love,",
			"(13) Seeking by craftiness to escape misfortune,",
			"(14) Falling into misfortune through the wiles of a crafty schemer,",
			"(15) Finding a sustaining power in misfortune,",
			"(16) Being delivered from misfortune by one who, in confidence, confesses a secret of transgression,",
			"(17) Bearing patiently with misfortunes and seeking to attain cherished aims honorably,",
			"(18) Rebelling against a power that controls personal abilities and holds them in subjection.",
			"(19) Meeting with misfortune and being cast away in a primitive, isolated and savage environment,",
			"(20) Becoming involved with conditions in which misfortune is indicated,",
			"(21) Falling into misfortune through mistaken judgment,",
			"(22) Following a wrong course through mistaken judgment,",
			"(23) Becoming involved in a complication that has to do with mistaken judgment and suspicion,",
			"(24) Becoming the victim of mistaken judgment in carrying out an enterprise,",
			"(25) Seeking to save a person who is accused of transgression,",
			"(26) Seeking secretly to preserve another from danger,",
			"(27) Refusing to betray another�s secret and calmly facing persecution because of the refusal,",
			"(28) Facing a situation in which the misfortunes of one greatly esteemed call for courage and sagacious enterprise,",
			"(29) Aiding another to hide from the world a fateful secret,",
			"(30) Enlisting whole-heartedly in the service of a needy unfortunate and conferring aid of the utmost value,",
			"(31) Living a lonely, cheerless life and seeking companionship",
			"(32) Seeking to conceal identity because of a lofty idealism,",
			"(33) Resisting secretly and from an honorable motive a mandate considered discreditable,",
			"(34) Embarking upon an enterprise of insurrection in the hope of ameliorating certain evil conditions,",
			"(35) Becoming involved in a complication that challenges the value of cherished ideals,",
			"(36) Undergoing an experience that results in a remarkable character change,",
			"(37) Seeking against difficulties to realize a cherished ideal.",
			"(38) Committing a grievous mistake and seeking in secret to live down its evil results,",
			"(39) Forsaking cherished ambitions to carry out an obligation,",
			"(40) Embarking upon an enterprise in which one obligation is opposed by another obligation.",
			"(41) Finding an obligation at variance with ambition, inclination or necessity,",
			"(42) Falling into misfortune while seeking honorably to discharge an obligation,",
			"(43) Seeking to overcome personal limitations in carrying out an enterprise,",
			"(44) Seeking by unusual methods to conquer personal limitations.",
			"(45) Seeking to forward an enterprise and encountering family sentiment as an obstacle.",
			"(46) Seeking retaliation for a grievous wrong that is either real or fancied,",
			"(47) Finding (apparently) an object greatly coveted, and obtaining (apparently) the object,",
			"(48) Assuming the character of a criminal in a perfectly honest enterprise.",
			"(49) Assuming a fictitious character when embarking upon a certain enterprise,",
			"(50) Being impelled by an unusual motive to engage in crafty enterprise,",
			"(51) Devising a clever and plausible delusion in order to forward certain ambitious plans,",
			"(52) Encountering a would-be transgressor and seeking to prevent a transgression,",
			"(53) Opposing the plans of a crafty schemer,",
			"(54) Becoming involved in a puzzling complication that has to do with an object possessing mysterious powers,",
			"(55) Becoming involved in a mysterious complication and seeking to make the utmost of a bizarre experience,",
			"(56) Seeking to test the value of a mysterious communication and becoming involved in weird complexities,",
			"(57) Seeking to unravel a puzzling complication,",
			"(58) Engaging in an enterprise and then mysteriously disappearing,",
			"(59) Engaging in an mysterious enterprise and becoming involved with the occult and the fantastic.",
			"(60) Becoming involved, through curiosity aroused by mystery, in a strange enterprise.",
			"(61) Becoming aware of an important secret that calls for decisive action,",
			"(62) Becoming involved in any sort of complication," };
	static String Cclauses[] = new String[] { "Pays a grim penalty in an unfortunate undertaking,",
			"Emerges happily from a serious entanglement.", "Foils a guilty plotter and defeats a subtle plot.",
			"Undertakes a role that leads straight to catastrophe.",
			"Emerges from a trying ordeal with sorely garnered wisdom.",
			"Makes the supreme sacrifice in carrying out an undertaking.",
			"Reverses certain opinions when their fallacy is revealed.", "Achieves a spiritual victory",
			"Achieves success and happiness in a hard undertaking.",
			"Meets with an experience whereby an error is corrected",
			"Discovers the folly of trying to appear otherwise than as one is in reality.",
			"Rescues integrity from a serious entanglement.", "Comes finally to the blank wall of enigma.",
			"Achieves a complete and permanent character transformation", "Meets any fate, good or evil." };

}
