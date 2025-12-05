## 1. Serialization
- Serialization is a mechanism of converting the state of an object into a byte stream.
- It helps us to save the current state of an object so that we can use it further and share complex data between different systems.
###### Important Points of Serialization
- ***Platform-Independent:** It means that if we serialize an object using a byte stream on one platform can be easily deserialized on different platforms.
- **Serializable Interface:*** If we want to make a class serializable, then it must implement the Serializable interface. This interface does not contain any methods or variables ( marker interface), but it gives a signal that the class is ready for serialization.
## 2. Deserialization
- Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
###### Important Points of Deserialization

- ***Rebuilds Objects:*** Deserialization takes the byte stream and turns it back into the original object with the same state as before.
- ****Platform-Independent:**** Deserialization works well with different platforms without any issues.
- ****Class Must Be Available:**** When we deserialize an object, it is necessary that the class definition be present in the program.