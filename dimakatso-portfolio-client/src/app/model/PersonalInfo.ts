import {Address} from './Address';
import {ContactDetails} from './ContactDetails';

export class PersonalInfo {
  id?: number;
  firstName?: string;
  lastName?: string;
  dateOfBirth?: string;
  contactDetails?: ContactDetails;
  address?: Address;
}
