function DestinationCard({ place }) {
  return (
    <div style={{
      border: "1px solid #ddd",
      borderRadius: "10px",
      overflow: "hidden",
      boxShadow: "0 4px 8px rgba(0,0,0,0.1)",
      transition: "0.3s",
    }}>
      <img 
        src={place.image} 
        alt={place.name}
        style={{ width: "100%", height: "200px", objectFit: "cover" }} 
      />

      <div style={{ padding: "15px" }}>
        <h3>{place.name}</h3>

        <button 
          onClick={() => alert(`Booking for ${place.name} coming soon`)}
          style={{
            marginTop: "10px",
            padding: "10px",
            width: "100%",
            background: "#007bff",
            color: "white",
            border: "none",
            borderRadius: "5px",
            cursor: "pointer"
          }}
        >
          Book Now
        </button>
      </div>
    </div>
  );
}

export default DestinationCard;