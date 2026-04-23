import { useState } from "react";

function SearchBar({ onSearch }) {
  const [query, setQuery] = useState("");

  return (
    <input
      placeholder="Search destinations..."
      value={query}
      onChange={(e) => {
        setQuery(e.target.value);
        onSearch(e.target.value);
      }}
      style={{ padding: "10px", width: "100%" }}
    />
  );
}

export default SearchBar;