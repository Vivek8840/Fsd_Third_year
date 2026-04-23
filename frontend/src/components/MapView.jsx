import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";

function MapView({ lat, lng, name }) {
  return (
    <MapContainer center={[lat, lng]} zoom={10} style={{ height: "300px" }}>
      <TileLayer
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      />
      <Marker position={[lat, lng]}>
        <Popup>{name}</Popup>
      </Marker>
    </MapContainer>
  );
}

export default MapView;