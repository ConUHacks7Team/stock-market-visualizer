import './App.css';
import Sidebar from './components/sidebar/Sidebar';

function App() {
  return (
    <div className="grid grid-cols-12 h-screen">
      <Sidebar className="col-span-12" />
    </div>
  );
}

export default App;
