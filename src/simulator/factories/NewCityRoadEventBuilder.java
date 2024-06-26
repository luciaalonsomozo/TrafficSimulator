package simulator.factories;

import simulator.model.Event;
import simulator.model.NewCityRoadEvent;

public class NewCityRoadEventBuilder extends NewRoadEventBuilder {

	public NewCityRoadEventBuilder () {
		super("new_city_road");
	}

	@Override
	Event createTheRoad() {
		return new NewCityRoadEvent(time, id, jsrc, jsdest, length, co2Limit, maxSpeed, weather);
	}

}
