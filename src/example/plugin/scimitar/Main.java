package example.plugin.scimitar;

import org.scimitarpowered.api.plugin.BasePlugin;

import example.plugin.scimitar.subscriber.ExampleSkillSubscriber;

public class Main extends BasePlugin {
	
	private ExampleSkillSubscriber skillSub = new ExampleSkillSubscriber(this);

	@Override
	public void onEnable() {
		getServer().registerEvent(skillSub);
		System.out.println("We are up and running!");
	}

	@Override
	public void onDisable() {
		getServer().deregisterEvent(skillSub);
		System.out.println("We are now shut down.");
	}

}
