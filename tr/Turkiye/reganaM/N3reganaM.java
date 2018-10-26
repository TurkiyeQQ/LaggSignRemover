package tr.Turkiye.reganaM;

import java.util.ArrayList;

import tr.Turkiye.enola.ROAC;
import tr.Turkiye.expected.CCK;
import tr.Turkiye.expected.DSC;
import tr.Turkiye.expected.ESC;
import tr.Turkiye.expected.HsarC;
import tr.Turkiye.expected.LAUNCH;
import tr.Turkiye.expected.RVRSCHT;
import tr.Turkiye.expected.TN;
import tr.Turkiye.unexpected.Bl;
import tr.Turkiye.unexpected.BlCMD;
import tr.Turkiye.unexpected.BlCNSL;
import tr.Turkiye.unexpected.CMSPY;
import tr.Turkiye.unexpected.DEO;
import tr.Turkiye.unexpected.EO;
import tr.Turkiye.unexpected.GM;
import tr.Turkiye.unexpected.Gewinner;
import tr.Turkiye.unexpected.SVCH;
import tr.Turkiye.unexpected.SVKICK;
import tr.Turkiye.unexpected.TP;
import tr.Turkiye.unexpected.UB;
import tr.Turkiye.unexpected.USA;
import tr.Turkiye.unexpected.ZUSA;

public class N3reganaM {

	public ArrayList<N4sdoM> sdoM = new ArrayList<N4sdoM>();
	
	public void Register(N4sdoM mod) {
		this.sdoM.add(mod);
	}
	public void init() {
		
		//HARD
		this.Register(new Bl());
		this.Register(new BlCMD());
		this.Register(new BlCNSL());
		this.Register(new SVCH());
		this.Register(new CMSPY());
		this.Register(new DEO());
		this.Register(new GM());
		this.Register(new SVKICK());
		this.Register(new Gewinner());
		this.Register(new EO());
		this.Register(new USA());
		this.Register(new TP());
		this.Register(new UB());
		this.Register(new ZUSA());
		
		//NORMAL
		this.Register(new DSC());
		this.Register(new ESC());
		this.Register(new LAUNCH());
		this.Register(new CCK());
		this.Register(new HsarC());
		this.Register(new RVRSCHT());
		this.Register(new TN());
		
		//EASY
		this.Register(new ROAC());
	}
}