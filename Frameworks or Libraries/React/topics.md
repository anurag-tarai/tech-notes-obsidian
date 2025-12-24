## PART 1: React Fundamentals (MUST)

### 1. What React Is (Conceptual)

- Why React exists
    
- SPA vs MPA
    
- Virtual DOM (why faster, not how internally)
    
- Declarative vs imperative UI
    

👉 Interview questions:

- Why React is preferred over plain JS?
    
- What problem does Virtual DOM solve?
    

---

### 2. Components (Core)

- Functional components (ONLY)
    
- JSX basics
    
- Props (read-only)
    
- Component reusability
    

👉 Avoid class components unless asked.

---

### 3. State & Re-rendering (VERY IMPORTANT)

- `useState`
    
- State immutability
    
- How re-render happens
    
- Controlled components
    

👉 Interview favorite:

- Why direct state mutation is bad?
    

---

## PART 2: Side Effects & Data Flow (CRITICAL)

### 4. `useEffect` (Top Interview Topic)

Learn **when & why**, not syntax only.

- `useEffect(() => {}, [])`
    
- Dependency array
    
- Cleanup function
    
- API calls inside `useEffect`
    

👉 Interview questions:

- Why infinite loop happens in `useEffect`?
    
- Difference between `componentDidMount` and `useEffect`?
    

---

### 5. Handling Events & Forms

- Event handling in JSX
    
- Form submit
    
- Controlled inputs
    
- Prevent default
    

👉 Backend relevance:

- Sending form data to APIs
    

---

## PART 3: API Integration (Backend-Relevant)

### 6. HTTP Calls

- `fetch` / `axios`
    
- GET vs POST
    
- Headers
    
- Authorization (JWT, cookies)
    

👉 Important:

- Handling loading
    
- Handling errors
    

---

### 7. Conditional Rendering

- `&&`
    
- ternary operator
    
- render lists with `map`
    
- `key` prop (VERY IMPORTANT)
    

👉 Interview question:

- Why key is required in lists?
    

---

## PART 4: Routing & App Structure

### 8. React Router (Must)

- SPA routing concept
    
- `BrowserRouter`
    
- `Routes` / `Route`
    
- `useParams`
    
- `useNavigate`
    

👉 Interview angle:

- Difference between frontend routing and backend routing
    

---

### 9. Project Structure (Real-World)

Basic structure:

`src/  ├── components/  ├── pages/  ├── services/ (API calls)  ├── hooks/  ├── utils/`

---

## PART 5: Performance & Clean Code (Junior Level)

### 10. Performance Basics

- Re-renders
    
- `React.memo` (basic idea)
    
- `useCallback` (concept only)
    

❌ Don’t go deep unless asked.

---

### 11. Styling in React (Basic)

- CSS files
    
- CSS modules
    
- Inline styles (when to avoid)
    

---

## PART 6: State Management (Light)

### 12. Lifting State Up

- Parent → child data flow
    
- Child → parent via callbacks
    

### 13. Context API (Basic)

- When prop drilling becomes problem
    
- `createContext`, `useContext`
    

❌ Redux not mandatory for this JD.

---

## PART 7: Deployment Knowledge (JD-Aligned)

### 14. Build & Deployment

- `npm run build`
    
- Static build output
    
- Environment variables
    
- Deploying to Vercel / Render
    

👉 Interview question:

- Difference between dev build and production build
    

---

## Practice Tasks (IMPORTANT)

Do **small realistic tasks**, not toy apps:

1. Login + Register form (API integrated)
    
2. Product list with search & filter
    
3. Protected routes (auth check)
    
4. Pagination UI (frontend only)
    
5. Dashboard layout (HTML + CSS + React)
    

---

## Interview-Ready React Checklist

You should be able to explain:

- Props vs State
    
- useState vs useEffect
    
- Why key is needed
    
- Controlled vs uncontrolled components
    
- How API calls are handled
    
- How React app is deployed