package example.plugin.scimitar.event;

import org.scimitarpowered.api.event.character.player.PlayerEvent;
import org.scimitarpowered.api.world.entity.character.player.Player;

public class ExampleCustomEvent extends PlayerEvent {
	
	private final String message;
	
	public ExampleCustomEvent(Player player, final String message) {
		super(player);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
