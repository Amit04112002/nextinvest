export class Users{
    public id: number;
    public first_name: string;
    public last_name:string;
    public email:string;
    public password:string;
    public role:string;

    constructor(id?: number, first_name?: string, last_name?: string, email?: string, password?: string, role?: string){
        this.id = id || 0;
        this.first_name = first_name || '';
        this.last_name = last_name || '';
        this.email= email || '';
        this.password= password || '';
        this.role= role || '';
    }
}