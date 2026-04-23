function DestinationCard({ place }) {
  return (
    <div style={{ border: "1px solid #ccc", padding: "10px" }}>
      <img src={place.image} width="100%" />
      <h3>{place.name}</h3>
    </div>
  );
}

export default DestinationCard;