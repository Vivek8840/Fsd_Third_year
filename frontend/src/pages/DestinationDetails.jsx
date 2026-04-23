import { useParams } from "react-router-dom";
import MapView from "../components/MapView";
import WeatherWidget from "../components/WeatherWidget";

function DestinationDetails() {
  const { name } = useParams();

  return (
    <div>
      <h1>{name}</h1>

      <MapView lat={26.9124} lng={75.7873} name={name} />

      <WeatherWidget city={name} />
    </div>
  );
}

export default DestinationDetails;