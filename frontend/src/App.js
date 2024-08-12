import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className='App'>
      <h1>My Todos</h1>
      <div className='todo-wrapper'>
        <div className='todo-input'>
          <div className='todo-input-item'>
            <label>Title</label>
            <input type='text' placeholder="What's the task title?" />
          </div>
          <div className='todo-input-item'>
            <label>Description</label>
            <label type="text" placeholder="What's the task description ?" />
          </div>
          <div className='todo-input-item'>
            <button type='button' className='primaryBtn'>Add</button>
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
