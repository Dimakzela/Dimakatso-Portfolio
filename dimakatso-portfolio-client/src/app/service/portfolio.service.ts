import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {PersonalInfo} from '../model/PersonalInfo';

export class PortfolioService {

  baseUrl = environment.baseUrl + '/personal-info';

  constructor(private http: HttpClient) {
  }

  getPersonalInfo() {
    return this.http.get<PersonalInfo[]>(this.baseUrl);
  }
}
