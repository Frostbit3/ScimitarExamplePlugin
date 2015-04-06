package example.plugin.scimitar.subscriber;

import org.scimitarpowered.api.event.EventSubscriber;
import org.scimitarpowered.api.event.character.player.PlayerSkillUpdateEvent;
import org.scimitarpowered.api.world.entity.character.player.Player;

import example.plugin.scimitar.Main;
import example.plugin.scimitar.event.ExampleCustomEvent;

/**
 * An example on event subscribing.
 * @author FrostBit3
 *
 */
public class ExampleSkillSubscriber implements EventSubscriber<PlayerSkillUpdateEvent> {

	private final Main plugin;
	private final String maxLevelMessage = "Congratulations on reaching the maximum level!";
	
	public ExampleSkillSubscriber(final Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void subscribe(PlayerSkillUpdateEvent event) {
		final Player plr = (Player) event.getPlayer();
		if (event.getLevel() == 99) {
			
			// We have sent the player a message!
			plr.sendMessage(maxLevelMessage);
			
			// We have just dispatched our own custom event!
			plugin.getServer().dispatchEvent(new ExampleCustomEvent(plr, maxLevelMessage));
		}
	}

}
