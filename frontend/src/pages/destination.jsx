import destinations from "../data/destinations";
import DestinationCard from "../components/DestinationCard";

function Destinations() {
  return (
    <div style={{ padding: "20px" }}>
      <h2>Popular Destinations</h2>

      <div style={{
        display: "grid",
        gridTemplateColumns: "repeat(3,1fr)",
        gap: "20px"
      }}>
        {destinations.map((place) => (
          <DestinationCard key={place.id} place={place} />
        ))}
      </div>
    </div>
  );
}

export default Destinations;